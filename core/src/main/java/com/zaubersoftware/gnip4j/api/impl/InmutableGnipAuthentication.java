/**
 * Copyright (c) 2011 Zauber S.A. <http://www.zaubersoftware.com/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zaubersoftware.gnip4j.api.impl;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.Validate;

import com.zaubersoftware.gnip4j.api.GnipAuthentication;

/**
 * Bean for storing basic user credentials
 * 
 * @author Guido Marucci Blas
 * @since Apr 28, 2011
 */
public final class InmutableGnipAuthentication implements GnipAuthentication {

    private final String username;
    private final String password;
    
    /**
     * Creates the BasicCredentials.
     *
     * @param username
     * @param password
     */
    public InmutableGnipAuthentication(@NotNull final String username, @NotNull final String password) {
        Validate.notNull(username, "The username cannot be null");
        Validate.notNull(password, "The password cannot be null");
            
        this.username = username;
        this.password = password;
    }
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
