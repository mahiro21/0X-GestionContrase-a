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
public class UtilesPassword {

    public final static String CADENA = "@#[]!+*";

    public static final int MAX_RANGO = 15;
    public static final int MIN_RANGO = 8;

    public static final boolean validarPassword(String pass) {
        //Atributos
        boolean testOK = true;
        int mayus = 0;
        int minus = 0;
        int num = 0;
        int sig = 0;

        //Validar longitud String
        if (validarStrMin(pass)) {
            for (int i = 0; i < pass.length(); i++) {
                //validar si es minúscula
                if (validarMin(pass.charAt(i))) {
                    testOK = true;
                    minus++;
                    //validar si es mayúscula
                } else if (validarMay(pass.charAt(i))) {
                    testOK = true;
                    mayus++;
                    //validar si es un dígito
                } else if (validarDig(pass.charAt(i))) {
                    testOK = true;
                    num++;
                    //Validar si es un caracter especial
                } else if (validarSig(pass.charAt(i))) {
                    testOK = true;
                    sig++;
                } else if (pass == null) {
                    pass = "null";
                    testOK = false;
                } else {
                    testOK = false;
                }
            }
        } else {
            testOK = false;
        }

        System.out.printf("Contraseña ..: %s%n", pass);

        return mayus > 0 && minus > 0 && num > 0 && sig > 0;
    }

    public static boolean validarMin(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean validarMay(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean validarDig(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean validarSig(char c) {

        return CADENA.contains("" + c);
    }

    public static final boolean validarStrMin(String str) {
        //
        if (str == null) {
            str = "";
        }

        return str.length() >= MIN_RANGO
                && str.length() <= MAX_RANGO;
    }
}
