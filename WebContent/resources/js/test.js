angular.module('bauApp.controllers').controller(
		'TestController',
		function($scope, $log) {

			$log.debug('#TEST Controller entering#');

            var wrapper = document.getElementById('cn-wrapper');
			$scope.menuLabel = "Menu";
            //open and close menu when the button is clicked
            $scope.open = false;
            // button.addEventListener('click', handler, false);

            function handler(){
                if(!open){
                    $scope.menuLabel = "Chiudi";
                    classie.add(wrapper, 'opened-nav');
                }
                else{
                    $scope.menuLabel = "Menu";
                    classie.remove(wrapper, 'opened-nav');
                }
                open = !open;
            }
            function closeWrapper(){
                classie.remove(wrapper, 'opened-nav');
            }

		});