package ar.edu.unlam.verano.pb2.testdisco;

import ar.edu.unlam.verano.pb2.disco.Disco;
import org.junit.Assert;
import org.junit.Test;

public class DiscoTest {
@Test
	public void testDisco() {
		Disco miDisco = new Disco(15.0, 30.0);
		
		Boolean estadoVerificacion = miDisco.verificarDisco(15.0, 30.0);
		
		Assert.assertEquals(true, estadoVerificacion);
		
	}
	
}
