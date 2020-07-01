"use strict";
function Session(x){
	sessionStorage.setItem('context', x)
	sessionStorage.setItem('javascript', x+'/resources/js')
	sessionStorage.setItem('css', x+'/resources/css')
	sessionStorage.setItem('image', x+'/resources/img')
}
// Front 단에 담는 곳 백단은 어트리뷰트

