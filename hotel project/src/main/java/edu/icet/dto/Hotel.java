package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    private String name;
    private String location;
    private String description;
    private String roomCount;
    private String email;
    private String contactNo;
}
