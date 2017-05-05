/*
 * Copyright (c) 2016 上海极值信息技术有限公司 All Rights Reserved.
 */
package shev.csv.shev.csv;

public class Bean
{
    private String id;
    private String name;
    private Integer gender;
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Integer getGender()
    {
        return gender;
    }
    public void setGender(Integer gender)
    {
        this.gender = gender;
    }
    @Override
    public String toString()
    {
        return "Bean [id=" + id + ", name=" + name + ", gender=" + gender + "]";
    }
    
    
}
