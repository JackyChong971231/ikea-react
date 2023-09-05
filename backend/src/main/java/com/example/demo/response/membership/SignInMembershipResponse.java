package com.example.demo.response.membership;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignInMembershipResponse {
    private String signedInToken;
    private Integer membershipId;
    private String firstName;
    private String lastName;
}
