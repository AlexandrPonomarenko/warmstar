 function validateForm(form) {
     var elems = form.elements;

     resetError(elems.login.parentNode);
     if (!elems.login.value) {
         showError(elems.login.parentNode, ' no empty');
     }

     resetError(elems.email.parentNode);
     if (!elems.email.value) {
         showError(elems.email.parentNode, ' no empty');
     }

     resetError(elems.FName.parentNode);
     if (!elems.FName.value) {
         showError(elems.FName.parentNode, ' no empty');
     }

     resetError(elems.LName.parentNode);
     if (!elems.LName.value) {
         showError(elems.LName.parentNode, ' no empty');
     }

     resetError(elems.password.parentNode);
     if (!elems.password.value) {
         showError(elems.password.parentNode, ' no empty');
     } else if (elems.password.value != elems.password2.value) {
         showError(elems.password.parentNode, ' Пароли не совпадают.');
     }

     // resetError(elems.to.parentNode);
     // if (!elems.to.value) {
     //     showError(elems.to.parentNode, ' Укажите, куда.');
     // }
     //
     // resetError(elems.message.parentNode);
     // if (!elems.message.value) {
     //     showError(elems.message.parentNode, ' Отсутствует текст.');
     // }
 }


 function showError(container, errorMessage) {
     container.className = 'error';
     var msgElem = document.createElement('span');
     msgElem.className = "error-message";
     msgElem.innerHTML = errorMessage;
     container.appendChild(msgElem);
 }

 function resetError(container) {
     container.className = '';
     if (container.lastChild.className == "error-message") {
         container.removeChild(container.lastChild);
     }
 }

 // function validate(form) {
 //     var elems = form.elements;
 //
 //     resetError(elems.from.parentNode);
 //     if (!elems.from.value) {
 //         showError(elems.from.parentNode, ' Укажите от кого.');
 //     }
 //
 //     resetError(elems.password.parentNode);
 //     if (!elems.password.value) {
 //         showError(elems.password.parentNode, ' Укажите пароль.');
 //     } else if (elems.password.value != elems.password2.value) {
 //         showError(elems.password.parentNode, ' Пароли не совпадают.');
 //     }
 //
 //     resetError(elems.to.parentNode);
 //     if (!elems.to.value) {
 //         showError(elems.to.parentNode, ' Укажите, куда.');
 //     }
 //
 //     resetError(elems.message.parentNode);
 //     if (!elems.message.value) {
 //         showError(elems.message.parentNode, ' Отсутствует текст.');
 //     }

