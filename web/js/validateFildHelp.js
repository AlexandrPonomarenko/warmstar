function validateFormHelp(form) {
    var elems = form.elements;

    resetError(elems.name.parentNode);
    if (!elems.name.value) {
        showError(elems.name.parentNode, ' no empty');
        return false;
    }

    resetError(elems.email.parentNode);
    if (!elems.email.value) {
        showError(elems.email.parentNode, ' no empty');
        return false;
    }

    resetError(elems.texthelp.parentNode);
    if (!elems.texthelp.value) {
        showError(elems.texthelp.parentNode, ' no empty');
        return false;
    }
    return true;
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