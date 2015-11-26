package test;

import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by vincent on 15/8/20.
 */
public class TestCenter {
    public static void main(String[] args) {
        Set<UserAccessVo> set = new HashSet<UserAccessVo>();
        List<UserAccessVo> list = new ArrayList<UserAccessVo>();
        UserAccessVo acc1 = new UserAccessVo(123,new Date());
        UserAccessVo acc2 = null;
        UserAccessVo acc3 = null;
        try {
            acc2 = new UserAccessVo(123,new SimpleDateFormat("yyyyMMdd").parse("18900101"));
            acc3 = new UserAccessVo(123,new SimpleDateFormat("yyyyMMdd").parse("19990202"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        set.add(acc1);
        set.add(acc2);
        set.add(acc3);
        list.add(acc1);
        list.add(acc2);
        list.add(acc3);
        Collections.sort(list);
        System.out.println(set);
        System.out.println(list);

        System.out.println(MessageFormat.format("java:access:company:{0}.count", new Integer[] {123123211}).replaceAll(",",""));
        System.out.println(MessageFormat.format("java:access:company:{0}.count", new Integer[] {123}).replaceAll(",",""));
    }
}
class UserAccessVo implements Comparable {
    private Integer uid;
    private Date accessDate;

    public UserAccessVo(Integer uid, Date accessDate) {
        this.uid = uid;
        this.accessDate = accessDate;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        UserAccessVo that = (UserAccessVo) o;

        return !(uid != null ? !uid.equals(that.uid) : that.uid != null);

    }

    @Override
    public int hashCode() {
        return uid != null ? uid.hashCode() : 0;
    }

    @Override
    public int compareTo(Object o) {
        UserAccessVo that = (UserAccessVo) o;
        if (this.accessDate.before(that.getAccessDate())) {
            return 1;
        }
        if (this.accessDate.after(that.getAccessDate())) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "UserAccessVo{" +
                "uid=" + uid +
                ", accessDate=" + new SimpleDateFormat("yyyyMMdd").format(accessDate) +
                '}';
    }
}
