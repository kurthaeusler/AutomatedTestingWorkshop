package com.kurt.atw.bdd.automation;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.CandidateSteps;
import org.junit.Test;

public abstract class CalcStory extends JUnitStory {

	private StoryConfig storyConfig;

	public CalcStory(StoryConfig storyConfig) {
		super();
		this.storyConfig = storyConfig;
	}

	@Override
	public Configuration configuration() {
		return storyConfig.configuration();
	}

	@Override
	public List<CandidateSteps> candidateSteps() {
		return storyConfig.candidateSteps();
	}

	@Test
	public void run() throws Throwable {
		super.run();
	}

}