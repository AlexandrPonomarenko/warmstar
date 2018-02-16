(function($) {
    $(document).ready(function() {
        $('.btn_delete').click(function() {
            var basketID = $(this).attr('product');
            var from = $('div[productform="' + basketID + '"]');
            var cost = parseInt($('#cost_item'));
            console.log(cost);
            var data = {};

            var child = $(from.children()[0]);

            data[child.attr("name")] = child.attr("value");
            $(child.find('p[name]')).each(function (index, el) {
                data[$(el).attr('name')] = $(el).attr("value");
            });

            $.ajax({
                type: 'POST',
                data: data,
                url: 'basket',
                success: function(result) {
                    var el = $('#cost');
                    console.log( "el " + el.html());
                    var v = parseInt(el.html());
                    console.log("v " + v);
                    el.html(v - cost);
                    console.log( "el " + el.html());
                    // $('#cost') = el;
                    from.remove();
                }
            });
        });
    });
})(window.jQuery);