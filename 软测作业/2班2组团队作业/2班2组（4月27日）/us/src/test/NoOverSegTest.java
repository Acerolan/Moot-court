package test;

import static org.junit.Assert.*;

import main.NoOverSeg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NoOverSegTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout = 3000)
	public final void testRunNoOverSeg1() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {4, 5, 7, 3, 4, 6, 3, 6,8,5,6,7};
		int ans = NewNoOverSeg.runNoOverSeg(4,data);
		assertEquals(13,ans);
	}

	@Test(timeout = 3000)
	public final void testRunNoOverSeg2() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {1, 3, 4, 3, 5, 7, 5,7,3,2,6,8};
		int ans = NewNoOverSeg.runNoOverSeg(4,data);
		assertEquals(8,ans);
	}

	@Test(timeout = 3000)
	public final void testRunNoOverSeg3() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {1,3,4,3,4,6};
		int ans = NewNoOverSeg.runNoOverSeg(2,data);
		assertEquals(6,ans);
	}

	@Test(timeout = 3000)
	public final void testRunNoOverSeg4() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {3,4,6};
		int ans = NewNoOverSeg.runNoOverSeg(1,data);
		assertEquals(6,ans);
	}

	@Test(timeout = 3000)
	public final void testRunNoOverSeg5() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {1,3,4};
		int ans = NewNoOverSeg.runNoOverSeg(1,data);
		assertEquals(4,ans);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public final void testRunNoOverSeg6() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {1};
		int ans = NewNoOverSeg.runNoOverSeg(1,data);
		assertEquals(3,ans);
		fail("请按要求输入线段的Left,right,value属性个数");

	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public final void testRunNoOverSeg7() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {1,1};
		int ans = NewNoOverSeg.runNoOverSeg(1,data);
		assertEquals(3,ans);
		fail("请按要求输入线段的Left,right,value属性个数");

	}

	@Test(timeout = 3000)
	public final void testRunNoOverSeg8() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {1,2,3,4};
		int ans = NewNoOverSeg.runNoOverSeg(1,data);
		assertEquals(3,ans);
		//fail("请按要求输入线段的Left,right,value属性个数");

	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public final void testRunNoOverSeg9() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {1,2,5};
		int ans = NewNoOverSeg.runNoOverSeg(2,data);
		assertEquals(3,ans);
		fail("提示“样例数应与n匹配”");

	}

	@Test(timeout = 3000)
	public final void testRunNoOverSeg10() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {2,3,3,1,2,4,1,3,3};
		int ans = NewNoOverSeg.runNoOverSeg(2,data);
		assertEquals(4,ans);
		//fail("提示“样例数应与n匹配”");

	}

	@Test(timeout = 3000)
	public final void testRunNoOverSeg11() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {1,1,4};
		int ans = NewNoOverSeg.runNoOverSeg(1,data);
		assertEquals(4,ans);
		//fail("提示”l应当小于r”");

	}
	@Test(timeout = 3000)
	public final void testRunNoOverSeg12() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {2,1,4};
		int ans = NewNoOverSeg.runNoOverSeg(1,data);
		assertEquals(4,ans);
		//fail("提示”l应当小于r”");

	}
	@Test(timeout = 3000)
	public final void testRunNoOverSeg13() {
		NoOverSeg NewNoOverSeg = new NoOverSeg();
		int data[] = {1,2,-1};
		int ans = NewNoOverSeg.runNoOverSeg(1,data);
		assertEquals(0,ans);
		//fail("提示”l应当小于r、且v应当大于0”");

	}

}
