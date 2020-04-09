package com.lcx.common.utils;

import java.io.File;

/**
 * 文件的工具类
 * @ClassName: FileUtil 
 * @Description: TODO
 * @author: LCX
 * @date: 2020年4月9日 下午3:30:15
 */
public class FileUtil {

	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){
		//如果文件名为空则返回null
		if(!StringUtil.hasText(fileName))
			return null;
		return  fileName.substring(fileName.lastIndexOf("."));
	}
	
}
