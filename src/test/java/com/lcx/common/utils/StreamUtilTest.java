package com.lcx.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

import com.lcx.common.utils.StreamUtil;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String file = StreamUtil.readTextFile(new FileInputStream("D:/data.txt"));
		System.out.println(file);
		
	}

	@Test
	public void testReadTextFileFile() throws FileNotFoundException {
		String file = StreamUtil.readTextFile(new File("d:/data.txt"));
		System.out.println(file);
	}

}
