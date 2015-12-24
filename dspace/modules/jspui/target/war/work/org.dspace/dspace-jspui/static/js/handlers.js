/**
 * Created by lalka on 12/20/2015.
 */
$( document ).ready(function() {

    $( "#metadata_export_omg" ).click(function( event ) {
        var arr = [];
        $('.exportThisItem').each(function(i, obj) {
            arr.push(obj.id);
        });
        alert(arr);

        $.ajax({
            async: false,
            type: "POST",
            contentType: "application/json",
            url: "browse?type=title&submit_export_metadata=Export+metadata",
            data: JSON.stringify(arr),
            dataType : "json",
            success: function(response){
                alert(response);
            }
        });
        alert("wow");
        return;
    });

});