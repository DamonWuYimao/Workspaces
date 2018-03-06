package Test;

import org.spring.Bean1;
import org.spring.Bean1Imp;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class InjectionTest extends TestCase {

	private BeanFactory factory;
	
	@Override
	protected void setUp() throws Exception {
		factory =new ClassPathXmlApplicationContext("applicationContext-*.xml");
	}

	@Override
	protected void tearDown() throws Exception {
		//
	}
	public void InjectionTest1(){
		Bean1Imp bean1=(Bean1Imp)factory.getBean("bean1");
		System.out.println("StringValue="+bean1.getStrValue());
		System.out.println("IntValue="+bean1.getIntValue());
		System.out.println("ListValue="+bean1.getListValue());
		System.out.println("SetValue="+bean1.getSetValue());
		System.out.println("ArrayValue="+bean1.getArrayValue());
			
	}

}
