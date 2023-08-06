package com.example.policygenerationservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class PolicyDocument {
    @Id
    private String documentId;
    private String transactionId;
    private String policySelectionId;
}
