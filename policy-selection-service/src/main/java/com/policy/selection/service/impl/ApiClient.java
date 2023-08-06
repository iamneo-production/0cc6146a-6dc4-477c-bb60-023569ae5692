package com.policy.selection.service.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.policy.selection.dto.PolicyCatalogDto;

@FeignClient(name = "POLICY-SERVICE")
public interface ApiClient {
    @GetMapping("/policies/{pId}")
    ResponseEntity<PolicyCatalogDto> getById(@PathVariable String pId);


}
