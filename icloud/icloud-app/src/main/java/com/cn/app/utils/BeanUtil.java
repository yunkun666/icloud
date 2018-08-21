package com.cn.app.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

/**
 * 实体类拷贝
 * @author Administrator
 *
 */
public class BeanUtil {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List copyList(List <? extends Object> poList , Class voClass){
		List voList = new ArrayList();
        
        Object voObj =null;
        for(Object poObj:poList){
            try {
                voObj = voClass.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            BeanUtils.copyProperties(poObj, voObj);
            voList.add(voObj);
        }
        return voList;
	}
	
	public static void copyBean(Object source,Object target){
		BeanUtils.copyProperties(source,target);
	}
}
