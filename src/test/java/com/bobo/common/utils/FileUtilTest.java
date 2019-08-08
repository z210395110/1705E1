/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: bobo-common
 * @Package: com.bobo.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月7日 下午4:51:54 
 * @version: V1.0   
 */
package com.bobo.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月7日 下午4:51:54  
 */
public class FileUtilTest {

	/**
	 * Test method for {@link com.bobo.common.utils.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {
  // String test ="abc.jpg";
   String test ="aaaaa";
   String name = FileUtil.getExtendName(test);
   System.out.println(name);
   
	}

	/**
	 * Test method for {@link com.bobo.common.utils.FileUtil#getTempDirectory()}.
	 */
	@Test
	public void testGetTempDirectory() {
		System.out.println(FileUtil.getTempDirectory());
	}

	/**
	 * Test method for {@link com.bobo.common.utils.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {
		System.out.println(FileUtil.getUserDirectory());
	}

}
