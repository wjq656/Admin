

						
(function(){
	
	/*for(var i = 0;i<3;i++){
		alert(block_two[i]+11);
	}数据获取成功*/
		//我需要记录三个模块的位置
		var nTop;
		var nLeft;
		//var box = document.getElementById("box");
		var input = document.getElementsByClassName("in");//修改
		var inputs = Array.prototype.slice.call(input);//已经成功转换成了数组元素可以控制到 每一个框  
		//接下来是如何通过把每一个盒子跟输入框 绑定
		var box = document.getElementsByClassName("box");
		var boxs = Array.prototype.slice.call(box);//将元素 转化成数组来控制
		//修改  增加的 底座
		var loca = document.getElementsByClassName("loca");
		var locas = Array.prototype.slice.call(loca);//将元素 转化成数组来控制
		var loca_height = 40;
		var  loca1_x = parseInt(locas[0].style.left);//获取到设定的位置  相对于窗体 而不是屏幕
		var  loca1_y = parseInt(locas[0].style.top);
		var  loca2_x = parseInt(locas[1].style.left);
		var  loca2_y = parseInt(locas[1].style.top);
		var  loca3_x = parseInt(locas[2].style.left);
		var  loca3_y = parseInt(locas[2].style.top);
		var uppers = loca_height;
		var topper1 = loca1_y;
		var topper2 = loca1_y;
		var topper3 = loca1_y;
		var x,y,top,left,mark = false;
		var ww = window.innerWidth;//获取窗口的大小
		var hh = window.innerHeight;
		var height = 0;
		var width=0;
		var maxX =0;
		var maxY = 0;
		var zIndex = 1;
		maxX = ww - width;
		maxY = hh - height;
		 maxX = ww - width;
		 maxY = hh - height;
		 
		 //起始定位
		 for(var i =0;i<3;i++){
			 
				if((floor1-1) == i){
					boxs[0].style.top =  360-i*40+"px";
					
					for(var j = 0;j<3;j++){
						if(block1-1 == j){
							
							boxs[0].style.left = 100 + j*450+"px";
						}
					}
				}
				
			}
		 
		 for(var i =0;i<3;i++){
			 
				if((floor2-1) == i){
					boxs[1].style.top = 360-40*i+"px";
					for(var j = 0;j<3;j++){
						if(block2-1 == j){
							boxs[1].style.left = 100 + j*450+"px";
						}
					}
				}
				
			}
		 for(var i =0;i<3;i++){
			 
				if((floor3-1) == i){
					boxs[2].style.top = 360-40*i+"px";
					for(var j = 0;j<3;j++){
						if(block3-1 == j){
							boxs[2].style.left = 100 + j*450+"px";
						}
					}
				}
				
			}
		 
		 
		boxs[0].addEventListener("mousedown",function(e){
			zIndex ++;
			this.style.zIndex =zIndex;
			var e = event;
			x = e.clientX;
			y = e.clientY;
			
			top = this.offsetTop;
			left = this.offsetLeft;
			mark = true;
		});
		boxs[0].addEventListener("mousemove",function(e){
			if(mark){
				var e = event
				var xx = e.clientX;
				var yy = e.clientY;
				 nTop = yy - y + top;
				 nLeft = xx - x + left;
				if(nTop <= 0)nTop = 1;
				if(nTop >= maxY)nTop =maxY;
				if(nLeft <= 0)nLeft = 1;
				if(nLeft >= maxX)nLeft =maxX;
				this.style.top = nTop +"px";
				this.style.left = nLeft +"px";
				inputs[0].value = nTop +"px"+nLeft+"px";
			}
		});
		boxs[0].addEventListener("mouseup",function(){mark = false;
			
		//传递参数
		if((nLeft>loca1_x)&&(nLeft<loca1_x+300))
			block1 = 1;
			
			//测试成功
		if((nLeft>loca2_x)&&(nLeft<loca2_x+300))
			block1 = 2;
		if((nLeft>loca3_x)&&(nLeft<loca3_x+300))
			block1 = 3;
		
	///	alert((nTop<loca2_y) && (nTop>(loca2_y-40)));
		
		
		if((nTop<loca2_y) && (nTop>(loca2_y-40)))
				floor1 = 1;
	//	alert((nTop<loca2_y-40) && (nTop>(loca2_y-80)))
		if((nTop<loca2_y-40) && (nTop>(loca2_y-80)))
				floor1 = 2;
		if(nTop<(loca2_y-80))
			floor1 = 3;
		//
		if(block1 = 1){
			if(block_one[floor1] == 1){
				floor1 = floor01;
				block1 = block01;
				
			}
		
	}
	if(block1 = 2){
			if(block_two[floor1] == 1){
				floor1 = floor01;
				block1 = block01;
			}
	}
	if(block1 = 3){
			if(block_three[floor1] == 1){
				floor1 = floor01;
				block1 = block01;
			}
			
	}
		
		//alert(nTop<(loca2_y-80))
		//这边三个没问题就是 错在 定位
	//  alert(floor1);
		window.location.href="http://localhost:808/hannuota02/move/moveServlet?block1="+block1+"&floor1="+floor1+"&block2="+block2+"&floor2="+floor2+"&block3="+block3+"&floor3="+floor3;
		
		
				
		});
		
		
		
		
		
		boxs[1].addEventListener("mousedown",function(e){
			zIndex ++;
			this.style.zIndex =zIndex;
			var e = event;
			x = e.clientX;
			y = e.clientY;
			top = this.offsetTop;
			left = this.offsetLeft;
			mark = true;
		});
		boxs[1].addEventListener("mousemove",function(e){
			if(mark){
				var e = event
				var xx = e.clientX;
				var yy = e.clientY;
				 nTop = yy - y + top;
				 nLeft = xx - x + left;
				if(nTop <= 0)nTop = 1;
				if(nTop >= maxY)nTop =maxY;
				if(nLeft <= 0)nLeft = 1;
				if(nLeft >= maxX)nLeft =maxX;
				this.style.top = nTop +"px";
				this.style.left = nLeft +"px";
				inputs[1].value = nTop +"px"+nLeft+"px";
			}
		});
		boxs[1].addEventListener("mouseup",function(){mark = false;
		//传递参数
			if((nLeft>loca1_x)&&(nLeft<loca1_x+300))
				block2 = 1;//测试成功
			if((nLeft>loca2_x)&&(nLeft<loca2_x+300))
				block2 = 2;
			if((nLeft>loca3_x)&&(nLeft<loca3_x+300))
				block2 = 3;
			if((nTop<loca2_y) && (nTop>(loca2_y-40)))
					floor2 = 1;
			if((nTop<loca2_y-40) && (nTop>(loca2_y-80)))
					floor2 = 2;
			if((nTop<loca2_y-80))
				floor2 = 3;
			//alert(floor2);
			window.location.href="http://localhost:808/hannuota02/move/moveServlet?block1="+block1+"&floor1="+floor1+"&block2="+block2+"&floor2="+floor2+"&block3="+block3+"&floor3="+floor3;
			
			
		
		});
		boxs[2].addEventListener("mousedown",function(e){
			zIndex ++;
			this.style.zIndex =zIndex;
			var e = event;
			x = e.clientX;
			y = e.clientY;
			top = this.offsetTop;
			left = this.offsetLeft;
			mark = true;
		});
		boxs[2].addEventListener("mousemove",function(e){
			if(mark){
				var e = event
				var xx = e.clientX;
				var yy = e.clientY;
				 nTop = yy - y + top;
				 nLeft = xx - x + left;
				if(nTop <= 0)nTop = 1;
				if(nTop >= maxY)nTop =maxY;
				if(nLeft <= 0)nLeft = 1;
				if(nLeft >= maxX)nLeft =maxX;
				this.style.top = nTop +"px";
				this.style.left = nLeft +"px";
				//alert(i);//为什么I一直是3
				inputs[2].value = nTop +"px"+nLeft+"px";//修改
				
			}
		});
		boxs[2].addEventListener("mouseup",function(){
			if((nLeft>loca1_x)&&(nLeft<loca1_x+300))
				block3 = 1;//测试成功
			if((nLeft>loca2_x)&&(nLeft<loca2_x+300))
				block3 = 2;
			if((nLeft>loca3_x)&&(nLeft<loca3_x+300))
				block3 = 3;
			if((nTop<loca2_y) && (nTop>(loca2_y-40)))
					floor3 = 1;
			if((nTop<loca2_y-40) && (nTop>(loca2_y-80)))
					floor3 = 2;
			if((nTop<loca2_y-80))
				floor3 = 3;
			//alert(block3+"==="+floor3);
			window.location.href="http://localhost:808/hannuota02/move/moveServlet?block1="+block1+"&floor1="+floor1+"&block2="+block2+"&floor2="+floor2+"&block3="+block3+"&floor3="+floor3;
			
			mark = false;
			});
	})()