package com.bbva.caaa;

import com.bbva.caaa.dto.request.RequestDTO;
import com.bbva.caaa.dto.response.ResponseDTO;
import com.bbva.caaa.lib.r001.CAAAR001;
import com.bbva.caaa.mocks.DummyMock;
import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.domain.transaction.Context;
import com.bbva.elara.domain.transaction.RequestHeaderParamsName;
import com.bbva.elara.domain.transaction.request.header.CommonRequestHeader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CAAAT00101COTransactionTest {

	private Map<String, Object> parameters;

	private Map<Class<?>, Object> serviceLibraries;

	@Mock
	private ApplicationConfigurationService applicationConfigurationService;

	@Mock
	private CommonRequestHeader commonRequestHeader;

    @Mock
    CAAAR001 caaaR001;

    private DummyMock dummyMock;


	private final CAAAT00101COTransaction transaction = new CAAAT00101COTransaction() {
		@Override
		protected void addParameter(String field, Object obj) {
			if (parameters != null) {
				parameters.put(field, obj);
			}
		}

		@Override
		protected Object getParameter(String field) {
			return parameters.get(field);
		}

		@Override
		protected <T> T getServiceLibrary(Class<T> serviceInterface) {
			return (T) caaaR001;
		}

		@Override
		public String getProperty(String keyProperty) {
			return applicationConfigurationService.getProperty(keyProperty);
		}

		@Override
		protected CommonRequestHeader getRequestHeader() {
			return commonRequestHeader;
		}
	};

	@Before
	public void setUp() {
        dummyMock = new DummyMock();
		MockitoAnnotations.initMocks(this);
		initializeTransaction();
		// TODO - Set the mocks created from the libraries to the transaction, e.g.:
		setServiceLibrary(CAAAR001.class, caaaR001);
	}

	private void initializeTransaction() {
		transaction.setContext(new Context());
		parameters = new HashMap<>();
		serviceLibraries = new HashMap<>();
	}

	private void setServiceLibrary(Class<?> clasz, Object mockObject) {
		serviceLibraries.put(clasz, mockObject);
	}

	private void setParameterToTransaction(String parameter, Object value) {
		parameters.put(parameter, value);
	}

	private Object getParameterFromTransaction(String parameter) {
		return parameters.get(parameter);
	}

	@Test
	public void executeTest() {
		// when(commonRequestHeader.getHeaderParameter(RequestHeaderParamsName.COUNTRYCODE)).thenReturn("ES");
		// when(applicationConfigurationService.getProperty("config.property")).thenReturn("value");
		// when(qwaiR001.execute()).thenReturn(listCustomerDTO);
		// setParameterToTransaction("customerIn", new CustomerDTO());
        //when(caaaR001.execute(Mockito.any())).thenReturn(dummyMock.responseDTOSucces());
		transaction.execute();
		Assert.assertEquals(0, transaction.getAdviceList().size());
	}

	@Test
	public void executeTest_SuccessOrquestation() {
		// 1. Instanciar los DTOs de prueba simulando la entrada de ASO
		RequestDTO mockRequest = new RequestDTO();
		mockRequest.setNumeroCuenta("001123456");

		ResponseDTO mockResponse = new ResponseDTO();
		mockResponse.setNombreTitular("Juan Perez");
		//mockResponse.setSaldo(1500000.0);

		// 2. Comportamiento esperado de los métodos de infraestructura APX
		//Mockito.doReturn(mockRequest).when(transaction).getRequest();
		//Mockito.doReturn(caaaR001).when(transaction).getServiceLibrary(CAAAR001.class);
//		Mockito.doReturn(new ArrayList<>()).when(transaction).getAdviceList(); // Lista de consejos vacía (Éxito)

		// 3. Mockear el comportamiento de la librería encapsulada
		Mockito.when(caaaR001.executeGetBalance("001123456")).thenReturn(mockResponse);

		// 4. Ejecución
		transaction.execute();

		// 5. Verificaciones de orquestación pura
		//Mockito.verify(caaaR001, Mockito.times(1)).executeGetBalance("001123456");
		//Mockito.verify(transaction, Mockito.times(1)).setResponse(mockResponse);
	}
}
