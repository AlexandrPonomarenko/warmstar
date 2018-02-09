(function($) {
    $(document).ready(function() {
        $('.btn_delete').click(function() {
            var basketID = $(this).attr('product');
            var from = $('div[productform="' + basketID + '"]');
            var cost = parseInt("300");
            var data = {};

            var child = $(from.children()[0]);

            data[from.attr("name")] = child.attr("value");
            $(child.find('p[name]')).each(function (index, el) {
                data[$(el).attr('name')] = $(el).attr("value");
            });

            $.ajax({
                type: 'POST',
                data: data,
                url: 'basket',
                success: function(result) {
                    var el = $('#cost');
                    var v = parseInt(el.html());

                    el.html(v - cost);

                    from.remove();
                }
            });
        });
    });
})(window.jQuery);