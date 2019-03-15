package com.lxm.mybatisplus.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * 
 *
 * @author lxm
 */
public class TDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门ID
     */
            @TableId(value = "DEPT_ID", type = IdType.AUTO)
    private Long deptId;

    /**
     * 上级部门ID
     */
        @TableField("PARENT_ID")
    private Long parentId;

    /**
     * 部门名称
     */
        @TableField("DEPT_NAME")
    private String deptName;

    /**
     * 排序
     */
        @TableField("ORDER_NUM")
    private Double orderNum;

    /**
     * 创建时间
     */
        @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
        @TableField("MODIFY_TIME")
    private LocalDateTime modifyTime;

        public Long getDeptId() {
        return deptId;
        }

            public void setDeptId(Long deptId) {
        this.deptId = deptId;
        }
        public Long getParentId() {
        return parentId;
        }

            public void setParentId(Long parentId) {
        this.parentId = parentId;
        }
        public String getDeptName() {
        return deptName;
        }

            public void setDeptName(String deptName) {
        this.deptName = deptName;
        }
        public Double getOrderNum() {
        return orderNum;
        }

            public void setOrderNum(Double orderNum) {
        this.orderNum = orderNum;
        }
        public LocalDateTime getCreateTime() {
        return createTime;
        }

            public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        }
        public LocalDateTime getModifyTime() {
        return modifyTime;
        }

            public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
        }

    @Override
    public String toString() {
    return "TDept{" +
            "deptId=" + deptId +
            ", parentId=" + parentId +
            ", deptName=" + deptName +
            ", orderNum=" + orderNum +
            ", createTime=" + createTime +
            ", modifyTime=" + modifyTime +
    "}";
    }
}
