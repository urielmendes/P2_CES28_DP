package Q4;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Q4.orig.a.Calculadora;
import Q4.orig.a.SistemaOperacional;
import Q4.orig.a.Despesa;
import Q4.orig.a.RelatorioDespesas;

public class RelatorioDespesasTest {
	
	
	@InjectMocks private RelatorioDespesas rela;
	@Mock private Calculadora calc;
	@Mock private SistemaOperacional so;
	private Iterator<Despesa> despesas;
	

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this); 
	}

	@Test
	public void test() {
		Mockito.when(calc.calculaDespesas(despesas)).thenReturn((float) 120.0);
		
	}

}
