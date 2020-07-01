var person = person || {}
person = (function(){
	let _, javascript, session
	
	let init = function(){
		alert('init 진입<-')
		 _ = sessionStorage.getItem('context'),
		 javascript = sessionStorage.getItem('javascript'),
		 session = sessionStorage.getItem('session')
		 alert('init 종료')
	}
	let join = function(payload){
		$.ajax({
			url : _+`/member/members`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				if(res === 'SUCCESS'){
					location.href = _+`/location/member/LoginForm`
				}else{
					location.href = _+`/location/member/joinForm`
				}
			},
			error: function(err){
				
			}
		})
	}
	let login = function(payload){
		alert('login function 가동')
		$.ajax({
			url : _+`/member/members/${payload.userid}`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				alert('로그인 성공')
				location.href = _+`/`
			},
			error: function(err){
				alert(err)
			}
		})
	}
	let logout = function(){
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('context')
		sessionStroage.removeItem('javascript')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('image')
		location.href = _+`/`
	}
	let remove = function(){
		$.ajax()
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('context')
		sessionStroage.removeItem('javascript')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('image')
		location.href = _+`/`
	}
	return {init, join, login, logout, remove}
})()