package ru.alexraydev.sdata;

import org.springframework.data.domain.AuditorAware;

public class CustomAuditorAware implements AuditorAware<String> {

	@Override
	public String getCurrentAuditor() {
		return "Kevin Bowersox";
	}

}
