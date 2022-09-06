
package com.omar.login;

import lombok.Data;

/**
 *
 * @author Omar Rodriguez
 */
@Data
public class User {
    private String user;
    private String password;
    private String token;
    private String error;
    
}
