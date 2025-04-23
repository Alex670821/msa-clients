package com.project.msa_clients.service.impl;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeServiceImpl employeeService;
    @Mock
    private EmployeeRepository employeeRepository;
    //given -> exitoso
    //should -> excepcion
    //when -> siempre va despues de un given o un should
    @Test
    void shouldReturnEmployee_whenSendCorrectEmployeeData(){
        //given
        Employee expectedEmployee = new Employee(1, "bryan",26,"example@example.com");
        //when
        Mockito.when(employeeRepository.save(any())).thenReturn(expectedEmployee);
        //then
        Employee response = employeeService.save(expectedEmployee);
        //assert
        assertEquals(expectedEmployee.getMail(), response.getMail());
    }

}
