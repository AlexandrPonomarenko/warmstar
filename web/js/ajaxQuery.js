(function($) {
    $(document).ready(function() {
        $('.btn_add').click(function() {
            var productId = $(this).attr('product');
            var from = $('form[product="' + productId + '"]');

            var data = {};
            $(from.children()).each(function (index, input) {
                data[$(input).attr('name')] = $(input).val();
            });

            $.ajax({
                type: 'POST',
                data: data,
                url: 'bikes',
                success: function(result) {
                    $('#' + productId).html(result);
                }
            });
        });
    });
})(window.jQuery);
