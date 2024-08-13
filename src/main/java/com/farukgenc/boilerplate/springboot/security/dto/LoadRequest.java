package com.farukgenc.boilerplate.springboot.security.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * Created on Ağustos, 2020
 *
 * @author Faruk
 */
@Getter
@Setter
@NoArgsConstructor
public class LoadRequest {

	// @NotEmpty(message = "{load_truncate_not_empty}")
	private boolean truncate;

	// @NotEmpty(message = "{load_region_not_empty}")
	private Region region;
}

enum Region {
	Vancouver,
	RestOfVancouver,
	Calgary
}
