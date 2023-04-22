package ml.lkxe.sms2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName student
 */
@TableName(value ="student")
public class Student implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Object id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String sno;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String sclass;

    /**
     * 
     */
    private String major;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Object getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getSno() {
        return sno;
    }

    /**
     * 
     */
    public void setSno(String sno) {
        this.sno = sno;
    }

    /**
     * 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     */
    public String getSclass() {
        return sclass;
    }

    /**
     * 
     */
    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    /**
     * 
     */
    public String getMajor() {
        return major;
    }

    /**
     * 
     */
    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Student other = (Student) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSno() == null ? other.getSno() == null : this.getSno().equals(other.getSno()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSclass() == null ? other.getSclass() == null : this.getSclass().equals(other.getSclass()))
            && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSno() == null) ? 0 : getSno().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSclass() == null) ? 0 : getSclass().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sno=").append(sno);
        sb.append(", password=").append(password);
        sb.append(", sclass=").append(sclass);
        sb.append(", major=").append(major);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}