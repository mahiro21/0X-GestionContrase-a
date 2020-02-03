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

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class UtilesContraseña {

    public static final int MAX_RANGO = 24;
    public static final int MIN_RANGO = 3;

    public static final boolean validarPassword(String pass) {
        boolean testOK = true;
        int mayus = 0;
        int minus = 0;
        int num = 0;
        int cs = 0;

        if (pass.length() <= MAX_RANGO && pass.length() >= MIN_RANGO) {
            for (int i = 0; i < pass.length(); i++) {
                //validar si es una letra
                if (Character.isLetter(pass.charAt(i))) {
                    testOK = true;
                    //Comprobar mayus
                    if (pass.charAt(i)
                            == Character.toUpperCase(pass.charAt(i))) {
                        mayus++;
                        //Comprobar minus
                    } else {
                        minus++;
                    }
                } else if (Character.isDigit(pass.charAt(i))) {
                    testOK = true;
                    num++;
                } else if (validarCS(pass.charAt(i))) {
                    testOK = true;
                    cs++;
                } else {
                    testOK = false;
                }
            }
        } else {
            testOK = false;
        }
//        System.out.println(mayus);
//        System.out.println(minus);
//        System.out.println(num);
//        System.out.println(cs);
//        System.out.println(testOK);
        System.out.printf("Contraseña ..: %s%n", pass);

        return testOK && mayus > 0 && minus > 0 && num > 0 && cs > 0;
        

    }

    public static final boolean validarCS(char c) {
        boolean testOK = true;

        switch (c) {
            case '@':
                testOK = true;
                break;
            case '#':
                testOK = true;
                break;
            case '[':
                testOK = true;
                break;
            case ']':
                testOK = true;
                break;
            default:
                testOK = false;
                break;
        }

        return testOK;
    }
}
