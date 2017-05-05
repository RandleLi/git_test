/*
 * Copyright (c) 2016 上海极值信息技术有限公司 All Rights Reserved.
 */
package shev.csv.shev.csv;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;


public class CvsUtil
{
    
    public static void main(String[] args) throws Exception {  
        CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream("C:/Users/ran/Desktop/test.csv"),"gbk"));
        //         * 基于列名转换，映射成类
        
        HeaderColumnNameTranslateMappingStrategy<Bean> mapper = 
                new HeaderColumnNameTranslateMappingStrategy<Bean>();
        mapper.setType(Bean.class);

        Map<String,String> columnMapping = new HashMap<String,String>();
        columnMapping.put("id", "id");//csv中的header1对应bean的header1
        columnMapping.put("name", "name");
        columnMapping.put("gender", "gender");
        mapper.setColumnMapping(columnMapping);

        CsvToBean<Bean>  csvToBean = new CsvToBean<Bean>();

        List<Bean> list = csvToBean.parse(mapper, reader);

        for(Bean e : list){
            System.out.println(e.getId());
        }
        reader.close();
    }  
}
