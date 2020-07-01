package com.project.web.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  
@Component
@Lazy
@AllArgsConstructor
@NoArgsConstructor
// AllArg는 생성자에 모두 다 
// noargs 디폴트 생성자 ( Allargs를 하면 디폴트 생성자가 안먹혀서 먹혀줘야함 )

// SpringBoot의 JPA를 수동으로 따라한것
public class MemberDTO {
	private String userid,password,name,birthday,
	gender,telephone, regdate, 
	accessCode;
	

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