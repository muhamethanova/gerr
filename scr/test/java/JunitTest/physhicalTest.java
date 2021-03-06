package JunitTest;
	/**
	*����������� ������ �� ���������� junit 
	*/
	import static org.junit.Assert.*; 

	/**
	* ����������� ����� ��� �������� ������ ������� ����� ����������� ����� ������� ������������ 
	*/
	import org.junit.After; 
	/**
	* ����������� ����� ��� �������� ������ ������� ����� ����������� �� ������� ������������ 
	*/
	import org.junit.Before; 
	/**
	* ����������� ����� ��� �������� ����� 
	*/
	import org.junit.Test; 
	/**
	* ����������� ����� ��� ��������� ������ ���������� 
	*/
	import org.junit.runner.JUnitCore; 
	/**
	* ����������� ����� ��� ������ ���������� 
	*/
	import org.junit.runner.Result; 

	/**
	* ����������� ����� 
	*/
	import Calc.physhicalCalc; 

	/**
	*��������� ����� 
	*/
	public class physhicalTest {
	/**
	*��������� �� ����� ��� ������������ 
	*/
		private physhicalCalc test;
		
		@Before
	    /**
	* ��������� �� ��, ��� ����� ����� ���������� ����� ������ ����������� ������� 
	*/
		public void init() { test = new physhicalCalc(); } 
		
	    @After
	    /**
	* ��������� �� ��, ��� ����� ����� ���������� ����� ������� ������������ ������  
	*/
	    public void tearDown() { test = null; } 
	    
	    @Test
		/**
	* ������ ����� ��� ����� 
	*/
	    public void testGet(){ 
		/**
	* ����������� ����� 
	*/
	    	test = new physhicalCalc(); 
			/**
	* �������� ������ ���� ��� ������� �������� ����� ������ 24 ����, ����� �������� ������ 7 ����, ���������� ����� 2, ���������� ������ ������ ������ 1,1 �� � ������� � �������������� ����������� 1169.44 
	*/
	    	assertEquals("590.63",test.getK(7, 2, 24, 0.5)); 
		 }
	    
	    
		private physhicalCalc test1;
		
		@Before
	    /**
	* ��������� �� ��, ��� ����� ����� ���������� ����� ������ ����������� ������� 
	*/
		public void init1() { test1 = new physhicalCalc(); } 
		
	    @After
	    /**
	* ��������� �� ��, ��� ����� ����� ���������� ����� ������� ������������ ������  
	*/
	    public void tearDown1() { test1 = null; } 
	    
	    @Test
		/**
	* ������ ����� ��� ����� 
	*/
	    public void testGet1(){ 
		/**
	* ����������� ����� 
	*/
	    	test1 = new physhicalCalc(); 
			/**
	* �������� ������ ���� ��� ������� �������� ����� ������ 7 �����, ����� �������� ������ 77 ����, ���������� ����� 200, ���������� ������ ������ ������ 1,1 �� � ������� � �������������� ����������� 1169.44 
	*/
	    	assertEquals("416882.81",test.getK(77, 200, 7, 1.1)); 
		 }
	    
		private physhicalCalc test2;
		
		@Before
	    /**
	* ��������� �� ��, ��� ����� ����� ���������� ����� ������ ����������� ������� 
	*/
		public void init2() { test2 = new physhicalCalc(); } 
		
	    @After
	    /**
	* ��������� �� ��, ��� ����� ����� ���������� ����� ������� ������������ ������  
	*/
	    public void tearDown2() { test2 = null; } 
	    
	    @Test
		/**
	* ������ ����� ��� ����� 
	*/
	    public void testGet2(){ 
		/**
	* ����������� ����� 
	*/
	    	test2 = new physhicalCalc(); 
			/**
	* �������� ������ ���� ��� ������� �������� ����� ������ 10 ����, ����� �������� ������ 14 ����, ���������� ����� 2, ���������� ������ ������ ������ 0,8 �� � ������� � �������������� ����������� 1169.44 
	*/
	    	assertEquals("787.5",test.getK(14, 2, 10, 0.8)); 
		 }
	    
		private physhicalCalc test3;
		
		@Before
	    /**
	* ��������� �� ��, ��� ����� ����� ���������� ����� ������ ����������� ������� 
	*/
		public void init3() { test3 = new physhicalCalc(); } 
		
	    @After
	    /**
	* ��������� �� ��, ��� ����� ����� ���������� ����� ������� ������������ ������  
	*/
	    public void tearDown3() { test3 = null; } 
	    
	    @Test
		/**
	* ������ ����� ��� ����� 
	*/
	    public void testGet3(){ 
		/**
	* ����������� ����� 
	*/
	    	test3 = new physhicalCalc(); 
			/**
	* �������� ������ ���� ��� ������� �������� ����� ������ 20 ����, ����� �������� ������ 365 ����, ���������� ����� 1, ���������� ������ ������ ������ 1,1 �� � ������� � �������������� ����������� 1169.44 
	*/
	    	assertEquals("15398.44",test.getK(365, 1, 20, 0.6)); 
		 }
}
