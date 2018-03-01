// var index = 0;
// var arrayV = ["video/2012 Porsche 911 Carrera (991) on 20' Vossen VVS-CV3 Concave Wheels - Rims.mp4",
//     "video/Audi S5 on 20'' Vossen VVS-CV7 Concave Wheels - Rims.mp4",
//     "video/BMW M6 - 'Gran Coupe' - Vossen VFS-2.mp4",
//     "video/Dynojet Stunt Bike Tuning - Nick Apex & Ernie Vigil.mp4",
//     "video/Ferrari 488 -  'Need 4 Speed' - Vossen Forged VPS-310.mp4",
//     "video/Ford Mustang - Vossen VFS-5.mp4",
//     "video/Ford Mustang GT - All New Vossen VFS-6 Utilizing Flow Formed Technology.mp4",
//     "video/Lexus RC 350 F-Sport Bagged - 'Far From Basic' - Vossen Forged LC-105T.mp4",
//     "video/Maserati GranTurismo Liberty Walk - Vossen x Work Wheels - VWS-2.mp4",
//     "video/MC Customs - Rolls-Royce Wraith · Vellano Wheels.mp4",
//     "video/Mercedes Benz CL63 Series on 22' Vossen VVS-CV3 Concave Wheels - Rims.mp4",
//     "video/Nissan GT-R Liberty Walk - Vossen x Work Wheels - VWS-2.mp4",
//     "video/Tesla Model S - Vossen 22'' CVT Directional Wheels - Rims.mp4",
//     "video/Twerk'D - Nick Apex Freestyle.mp4",
//     "video/Vossen x State Bicycle Co. - Fixed Gear Bikes.mp4",
//     "video/Vossen x State Bicycle Co. - Fixed Gear Bikes (1).mp4",
//     "video/Vossen x State Bicycle 2016 - 'Limited Edition' - Fixed Gear Road Bike and Fat Bike.mp4"];
//     function autoPlay() {
//         console.log(arrayV[index]);
//         $(".video_source").attr("src", arrayV[index]);
//         $(".videos")[0].load();
//
//         index++;
//         if(index == arrayV.length){
//            index = 0;
//         }
//     }
//
//     $("#video").bind("ended", function() {
//         autoPlay();
//     });


(function ($) {
    var last = null,
        index = 0,
        arrOfPaths = [
            "video/2012 Porsche 911 Carrera (991) on 20' Vossen VVS-CV3 Concave Wheels - Rims.mp4",
            "video/Audi S5 on 20'' Vossen VVS-CV7 Concave Wheels - Rims.mp4",
            "video/BMW M6 - 'Gran Coupe' - Vossen VFS-2.mp4",
            "video/Ferrari 488 -  'Need 4 Speed' - Vossen Forged VPS-310.mp4",
            "video/Ford Mustang - Vossen VFS-5.mp4",
            "video/Ford Mustang GT - All New Vossen VFS-6 Utilizing Flow Formed Technology.mp4",
            "video/Lexus RC 350 F-Sport Bagged - 'Far From Basic' - Vossen Forged LC-105T.mp4",
            "video/Maserati GranTurismo Liberty Walk - Vossen x Work Wheels - VWS-2.mp4",
            "video/MC Customs - Rolls-Royce Wraith · Vellano Wheels.mp4",
            "video/Mercedes Benz CL63 Series on 22' Vossen VVS-CV3 Concave Wheels - Rims.mp4",
            "video/Nissan GT-R Liberty Walk - Vossen x Work Wheels - VWS-2.mp4",
            "video/Tesla Model S - Vossen 22'' CVT Directional Wheels - Rims.mp4",
            "video/Twerk'D - Nick Apex Freestyle.mp4",
            "video/Vossen x State Bicycle Co. - Fixed Gear Bikes.mp4",
            "video/Vossen x State Bicycle Co. - Fixed Gear Bikes (1).mp4",
            "video/Vossen x State Bicycle 2016 - 'Limited Edition' - Fixed Gear Road Bike and Fat Bike.mp4"
        ];

    function change (video, callback) {
        if (last) {
            last.off('ended');
            last.fadeTo("slow", 0, function() {
                $(this).remove();
            });
        }

        video.fadeTo("slow" , 1, function () {
            last = video;
            callback();
        });
    }

    function play (i) {
        var video = $('<video class="videos">');
        video.html('<source class="video_source" src="' + arrOfPaths[i] + '">');

        index += 1;
        if (index > arrOfPaths.length - 1) {
            index = 0;
        }

        video.on('ended', function () {
            play(index);
        });

        video.css({'opacity': 0});
        $('.video-container').append(video);

        change(video, function () {
            video[0].play();
        });
    }

    $(document).ready(function() {
        play(0)
    });
})(jQuery);