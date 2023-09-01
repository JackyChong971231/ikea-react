package com.example.demo.controller;

import com.example.demo.model.Membership;
import com.example.demo.request.membership.SignUpMembershipRequest;
import com.example.demo.request.membership.SignInMembershipRequest;
import com.example.demo.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/ikea-clone/membership")
public class MembershipController {

    private final MembershipService membershipService;

    @Autowired
    public MembershipController(MembershipService membershipService) {
        this.membershipService = membershipService;
    }

    @PostMapping
    public List<Membership> getMembership() {
        return membershipService.getMemberships();
    }

    @PostMapping("/sign-up")
    public ResponseEntity<Object> signUpMembership(
            @RequestBody SignUpMembershipRequest request
    ) {
        return ResponseEntity.ok(membershipService.addNewMembership(request));
    }

    @PostMapping("/sign-in")
    public ResponseEntity<Object> signInMembership (
            @RequestBody SignInMembershipRequest request
    ) {
        return ResponseEntity.ok(membershipService.signIn(request));
    }
}