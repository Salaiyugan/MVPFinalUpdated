angular.module('airbnb', ["ui.router"])
    .config(function($stateProvider, $urlRouterProvider){

      $urlRouterProvider.otherwise("/login");

      $stateProvider
          .state('root', {
              abstract: true,
              url:''
          })
          
          .state('root.home', {
              url: '/login',
              templateUrl: 'views/login.html',
              controller:'responseControl'
          })
          
          .state('root.signup', {
              url: '/welcome',
              templateUrl: 'views/signup.html',
              controller:'signupControl'
          })
          
          .state('root.profile', {
              url: '/profile',
              templateUrl: 'views/profile.html'
          })
          .state('root.profile.info', {
              url: '/info',
              templateUrl: 'views/info.html',
              controller:'infoControl'
          })
         
          
             .state('root.profile.home', {
              url: '/home',
              templateUrl: 'views/home.html'
          })
          
             .state('root.profile.homes', {
              url: '/homes',
              templateUrl: 'views/homes.html'
          })
          
          
             .state('root.profile.help', {
              url: '/help',
              templateUrl: 'views/help.html'
          })
          
          
             .state('root.profile.booking', {
              url: '/booking',
              templateUrl: 'views/booking.html'
          })
          
          
             .state('root.profile.trips', {
              url: '/trips',
              templateUrl: 'views/trips.html'
          });
          
         
    });
          
          
          