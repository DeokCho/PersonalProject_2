package com.project.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data  @Component
public class MemberDTO {
	private String userid, password;
	

}


/*
package com.project.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class BaseballDTO {
	private String referenceSeq, playerName, gamesPlayed, atBat, runs, 
					hits, doubles, triples, homeRuns, runsBattedIn, 
					walks, strikeouts, stolenBases, caughtStealing, battingAverage, 
					onBasePercentage, sluggingPercentage;
*/