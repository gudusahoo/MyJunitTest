junit is a unit testing framework tool for java.it is also called as whitebox/glassbox/transparent/unit testing.this is 
basically the testing done by developer after crating the application 
it has 5 annotations such as 
1>  @Before
2>  @After
3>	@BeforeClass
4>	@AfterClass
5>	@Test

1>	When writing tests, it is common to find that several tests need similar objects created before they can run. those are 
written in @Before or before method
2> f you allocate external resources in a Before method you need to release them after the test runs.those are wriiten in
@After or after method
3>	BeforeClass is used to do some opearation before starting the execution.like loging into the database
4>  If you allocate expensive external resources in a BeforeClass method you need to release them after all the tests 
in the class have run. these are written in @AfterClass. @AfterClass methods are guaranteed to run even if a
BeforeClass method throws an exception. 
5>@Test is used to test something like we did in java main method

NOTE:>
-->execution always starts from @Test like we did in main method.without test junit testcase cannot be run
-->everything written inside the testcase class is called as UTP(unit testing programme)

some common standardization:>
..>every junit testcase class name should be end eith test
..>like test case every metho in testcase shouldbe be end with test
