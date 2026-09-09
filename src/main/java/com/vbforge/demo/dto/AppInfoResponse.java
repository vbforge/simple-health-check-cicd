package com.vbforge.demo.dto;

// JUNIOR NOTE: record instead of a class — immutable by construction, and equals/hashCode/toString
// come for free. Perfect fit for a response payload that's just data, no behavior.
public record AppInfoResponse(String name, String version) {
}