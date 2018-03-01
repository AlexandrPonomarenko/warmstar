(function () {
    var className = ".validate",
        buttonClassName = ".submit-button",
        enptyClass = "empty",
        smallLength = "length",
        badWords = "bad-words";

    function isEmpty (value) {
        return value === "";
    }

    function isSmallLength (value) {
        return value.length < 1;
    }

    function isBadWords (value) {
        return !/^([A-Za-z0-9_])+$/g.test(value);
    }

    function remove (el) {
        el.parent()
            .removeClass(enptyClass)
            .removeClass(smallLength)
            .removeClass(badWords);
    }

    function check (el) {
        var value;

        el = $(el);
        value = el.val().trim();

        remove(el);

        if (isEmpty(value)) {
            el.parent().addClass(enptyClass);
        } else if (isSmallLength(value)) {
            el.parent().addClass(smallLength);
        } else if (isBadWords(value)) {
            el.parent().addClass(badWords);
        }

        chackButton();
    }

    function chackButton () {
        var i, els = $(className), l = els.length;

        for (i = 0; i < l; i++) {
            var value = $(els[i]).val().trim();
            if (isEmpty(value) || isSmallLength(value) || isBadWords(value)) {
                $(buttonClassName).prop('disabled', true);
                return;
            }
        }

        $(buttonClassName).prop('disabled', false);
    }

    $(document).ready(function() {
        $(className)
        // .on('keyup', function () {
        //     check(this);
        // })
        .focusout(function() {
            check(this);
            chackButton();
        });
        // .focusin(function() {
        //     check(this);
        // });
    });
})();