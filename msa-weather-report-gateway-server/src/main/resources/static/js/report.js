$(function() {

    $("#selectCityId").change(function() {
        var cityId = $("#selectCityId").val();

        var url = '/weather/report/'+cityId;
        window.location.href = url;
    });
});