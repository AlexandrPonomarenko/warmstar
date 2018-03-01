(function ($) {
    var className = "no-invisible";
    var classIsAdded = false;
    $(window).scroll(function () {
        if ($(window).scrollTop() === 0) {
            if (classIsAdded) {
                classIsAdded = false;
                $('header').removeClass(className);
            }
        } else {
            if (!classIsAdded) {
                classIsAdded = true;
                $('header').addClass(className);
            }
        }

    });
})(window.jQuery);

