/* <---------------------------------------------------Login--------------------------------------------------> */

var response = angular.module('airbnb')
	
			response.controller('responseControl',function($scope,$http,$window,$state) 
			{
				function init(){
					$scope.user2 = {};
				}
								
				$scope.login=function login(user,pwd)	{	
				
						//GET request 
						var url = "http://localhost:8080/AirBnB/web/user/auth?email="+user+"&pwd="+pwd;
						
					$http.get(url).then(
							function(payload) {
								console.log(payload.data);
								$scope.user2 = JSON.parse(payload.data);
								$scope.displayname= $scope.user2;
						
								
								$window.sessionStorage.setItem("user_detail", JSON.stringify($scope.displayname));
								$window.alert("Please fill some details and then proceed...Ignore if already done!!");
								$state.go('root.profile.info');
                
							},
							function() {
								$window.alert("wrong credentials");
							});
					
				}
				
				$scope.signup=function(){
						$state.go('root.signup');
				}
				init();
			});
      
      /* <--------------------------------------------------SignUP----------------------------------------------------------> */
      
      
      var response = angular.module('airbnb')
	
			response.controller('signupControl',function($scope,$http,$state) 
			{
								
				$scope.submit=function(user,email,pwd)	{	
				
					var data = {
							name: user,
						    email: email,
						    pwd: pwd
							};
							var url = "http://localhost:8080/AirBnB/web/user/add";
							$http.post(url, data)
							.then(function (data,Status) {
								$scope.Status = "success";
                alert('Account created!!');
							},function (data,Status) {
								$scope.Status = "failure" ;
							});
						}
						$scope.redirectIndex=function(){
						$state.go('root.home');
					}
						});
      
     /* <--------------------------------------------------  infoControl-----------------------------------------------------------------> */
      
      var response = angular.module('airbnb')
  	
		response.controller('infoControl',function($scope,$http,$window,$state) 
		{
			$scope.user3 = {};	
				$scope.user3 = JSON.parse($window.sessionStorage.getItem("user_detail"));
				console.log($scope.user3.name);
				console.log($scope.user3.userid);
				
				
				
			
				$scope.goback = function goback()	{	
					$scope.user3 = {};	
					$scope.user3 = JSON.parse($window.sessionStorage.getItem("user_detail"));
					console.log($scope.user3.name);
					console.log($scope.user3.userid);
					$scope.user_id = $scope.user3.userid;
					var url = "http://localhost:8080/AirBnB/web/userdetail/getAllUserDetails?user_id="+$scope.user_id;
					$http.get(url)
					.then(function (response) {
						$scope.data = JSON.parse(response.data);
						$scope.country = $scope.data.country;
						console.log($scope.country);
						
						$state.go('root.profile.home');
						
						if($scope.country == "India")
							$window.alert('Price listed are in Indian Rupees!!');
						else if($scope.country == "Australia")
							$window.alert('Price listed are in Australian Dollars!!');
						else if($scope.country == "USA")
							$window.alert('Price listed are in American Dollars!!');
						
						
						
					},function (response) {
						$scope.Status = "failure" ;
						$window.alert("You have to fill the details first");
					});

					
					
				}
				
				$scope.save=function save(phone,country)	{	
					
					var data = {
							phone: phone,
							country: country,
							user_id : $scope.user3.userid
								
							};
							var url = "http://localhost:8080/AirBnB/web/userdetail/add";
							$http.post(url, data)
							.then(function (data,Status) {
								$scope.Status = "success";
								$window.alert('Update Success!!');
								
								$scope.country_detail = data.config.data.country;
								$window.sessionStorage.setItem("country_detail", JSON.stringify($scope.country_detail));
								
								$state.go('root.profile.home');
								
								if($scope.country_detail == "India")
									$window.alert('Price listed are in Indian Rupees!!');
								else if($scope.country_detail == "Australia")
									$window.alert('Price listed are in Australian Dollars!!');
								else if($scope.country_detail == "USA")
									$window.alert('Price listed are in American Dollars!!');
								
								
								
							},function (data,Status) {
								$scope.Status = "failure" ;
							});

				
				};	
		});
      