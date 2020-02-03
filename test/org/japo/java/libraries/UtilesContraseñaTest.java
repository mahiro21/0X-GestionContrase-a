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
public class UtilesContraseñaTest {

    public UtilesContraseñaTest() {
    }

    @Test
    public void testValidarPassword01() {
        // Referencias
        int num = 01;
        String cde = "Contraseña válida";

        // Caso de Prueba - Parametros
        String param1 = "Pepe32@";

        // Resultado Esperado
        boolean resPre = true;

        // Cálculos
        boolean resCal = UtilesContraseña.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n",
                num, cde, param1, resPre);
    }
    
    @Test
    public void testValidarPassword02() {
        // Referencias
        int num = 02;
        String cde = "Contraseña solo números";

        // Caso de Prueba - Parametros
        String param1 = "123456";

        // Resultado Esperado
        boolean resPre = false;

        // Cálculos
        boolean resCal = UtilesContraseña.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n",
                num, cde, param1, resPre);
    }
    
    @Test
    public void testValidarPassword03() {
        // Referencias
        int num = 03;
        String cde = "Contraseña solo letras";

        // Caso de Prueba - Parametros
        String param1 = "qweasd";

        // Resultado Esperado
        boolean resPre = false;

        // Cálculos
        boolean resCal = UtilesContraseña.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n",
                num, cde, param1, resPre);
    }
    
    @Test
    public void testValidarPassword04() {
        // Referencias
        int num = 04;
        String cde = "Contraseña solo caracteres especiales(habilitados)";

        // Caso de Prueba - Parametros
        String param1 = "@#[]";

        // Resultado Esperado
        boolean resPre = false;

        // Cálculos
        boolean resCal = UtilesContraseña.validarPassword(param1);

        // Validación
        String msg = String.format("[Prueba #%02d - %s]", num, cde);
        assertEquals(msg, resPre, resCal);

        // Mensaje de Traza
        System.out.printf("Prueba #%02d - %-10s - %s -> %b%n",
                num, cde, param1, resPre);
    }

    @Test
    public void testValidarCS() {
    }

}
