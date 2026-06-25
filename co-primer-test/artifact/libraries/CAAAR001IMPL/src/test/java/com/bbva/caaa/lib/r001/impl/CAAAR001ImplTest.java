package com.bbva.caaa.lib.r001.impl;

import com.bbva.caaa.dto.request.RequestDTO;
import com.bbva.caaa.dto.response.ResponseDTO;
import com.bbva.elara.domain.transaction.Context;
import com.bbva.elara.domain.transaction.ThreadContext;

import com.bbva.elara.utility.jdbc.JdbcUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CAAAR001ImplTest {


	@InjectMocks
	private CAAAR001Impl caaaR001; // @InjectMocks crea la instancia real para ejecutar su lógica interna

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void executeTest_Success(){

		String cuentaValida = "001123456";

		ResponseDTO response = caaaR001.executeGetBalance(cuentaValida);

		Assert.assertNotNull(response);
		Assert.assertEquals("Juan Perez", response.getNombreTitular());
		Assert.assertEquals(Double.valueOf(1500000.0), response.getSaldo());
		//Assert.assertEquals(0, caaaR001.getAdviceList().size());
	}

	@Test
	public void executeTest_NotFound(){
		// Caso 2: Cualquier otra cuenta que no exista [cite: 63]
		String cuentaInexistente = "999999999";

		ResponseDTO response = caaaR001.executeGetBalance(cuentaInexistente);

		Assert.assertNotNull(response);
		Assert.assertEquals("Cuenta no encontrada", response.getNombreTitular()); // [cite: 66]
		Assert.assertEquals(Double.valueOf(0.0), response.getSaldo()); // [cite: 67]
		//Assert.assertEquals(0, caaaR001.getAdviceList().size());
	}

	@Test
	public void executeTest_NullAccount(){
		// Caso 3: Validación de cuenta nula (Manejo de errores) [cite: 170]
		ResponseDTO response = caaaR001.executeGetBalance(null);

		Assert.assertNotNull(response);
		Assert.assertEquals("400", response.getHttpCode());
		Assert.assertEquals("El número de cuenta es obligatorio.", response.getNombreTitular());
	}

	@Test
	public void executeTest_EmptyAccount(){
		// Caso 3: Validación de cuenta vacía [cite: 170]
		ResponseDTO response = caaaR001.executeGetBalance("   ");

		Assert.assertNotNull(response);
		Assert.assertEquals("400", response.getHttpCode());
		Assert.assertEquals("El número de cuenta es obligatorio.", response.getNombreTitular());
	}


}
