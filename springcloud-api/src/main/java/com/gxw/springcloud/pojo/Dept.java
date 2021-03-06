package com.gxw.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor //无参构造器
@Accessors(chain = true) //支持链式写法 例如 dept.setDept('123').setDname(''123)
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }

}
