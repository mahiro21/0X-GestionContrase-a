/* 
 * Copyright 2020 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class UtilesPasswordTest {

    public UtilesPasswordTest() {
    }

    @Test
    public void testValidarPassword01() {
        // Referencias
        int num = 1;
        String cde = "Caso normal";

        // Caso de Prueba - Parametros
        String param1 = "Abcde12@";

        // Resultado Esperado
        boolean resPre = true;

        // Cálculos
        boolean resCal = UtilesPassword.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n%n",
                num, cde, param1, resPre);
    }

    @Test
    public void testValidarPassword02() {
        // Referencias
        int num = 2;
        String cde = "Omisión mayúscula";

        // Caso de Prueba - Parametros
        String param1 = "abcde12@";

        // Resultado Esperado
        boolean resPre = false;

        // Cálculos
        boolean resCal = UtilesPassword.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n%n",
                num, cde, param1, resPre);
    }

    @Test
    public void testValidarPassword03() {
        // Referencias
        int num = 3;
        String cde = "Omisión minúscula";

        // Caso de Prueba - Parametros
        String param1 = "ABCDE12@";

        // Resultado Esperado
        boolean resPre = false;

        // Cálculos
        boolean resCal = UtilesPassword.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n%n",
                num, cde, param1, resPre);
    }

    @Test
    public void testValidarPassword04() {
        // Referencias
        int num = 4;
        String cde = "Omisión dígito";

        // Caso de Prueba - Parametros
        String param1 = "Abcdefg@";

        // Resultado Esperado
        boolean resPre = false;

        // Cálculos
        boolean resCal = UtilesPassword.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n%n",
                num, cde, param1, resPre);
    }

    @Test
    public void testValidarPassword05() {
        // Referencias
        int num = 5;
        String cde = "Omisión cáracter especial";

        // Caso de Prueba - Parametros
        String param1 = "Abcde123";

        // Resultado Esperado
        boolean resPre = false;

        // Cálculos
        boolean resCal = UtilesPassword.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n%n",
                num, cde, param1, resPre);
    }

    @Test
    public void testValidarPassword06() {
        // Referencias
        int num = 6;
        String cde = "Longitud mayor";

        // Caso de Prueba - Parametros
        String param1 = "Abcdefghij12345@";

        // Resultado Esperado
        boolean resPre = false;

        // Cálculos
        boolean resCal = UtilesPassword.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n%n",
                num, cde, param1, resPre);
    }

    @Test
    public void testValidarPassword07() {
        // Referencias
        int num = 7;
        String cde = "Longitud menor";

        // Caso de Prueba - Parametros
        String param1 = "A@";

        // Resultado Esperado
        boolean resPre = false;

        // Cálculos
        boolean resCal = UtilesPassword.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n%n",
                num, cde, param1, resPre);
    }

    @Test
    public void testValidarPassword08() {
        // Referencias
        int num = 8;
        String cde = "valor null";

        // Caso de Prueba - Parametros
        String param1 = null;

        // Resultado Esperado
        boolean resPre = false;

        // Cálculos
        boolean resCal = UtilesPassword.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n%n",
                num, cde, param1, resPre);
    }

}
