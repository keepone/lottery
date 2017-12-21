  var   xmlDoc;   
  var   nodeIndex; 
  function   getxmlDoc()   
  {
	  xmlDoc=new   ActiveXObject("Microsoft.XMLDOM");
          var   currNode;   
          xmlDoc.async=false;   
          xmlDoc.load("../js/Area.xml");   
          if(xmlDoc.parseError.errorCode!=0)   
          {   
                  var   myErr=xmlDoc.parseError;   
                  alert("����"+myErr.reason);   
          }          
  }
  function Init()
  {
    //��xlmdocm�ĵ�
    getxmlDoc();
    var   dropElement1=document.getElementById("Select1"); 
    var   dropElement2=document.getElementById("Select2"); 
    var   dropElement3=document.getElementById("Select3");   
    RemoveDropDownList(dropElement1);
    RemoveDropDownList(dropElement2);
    RemoveDropDownList(dropElement3);
    var  TopnodeList=xmlDoc.selectSingleNode("address").childNodes;
    if(TopnodeList.length>0)
    {
        //ʡ���б�
        var country;
        var province;
        var city;
        for(var   i=0; i<TopnodeList.length;   i++)
        {
              //����б���Ŀ
              country=TopnodeList[i];       
              var   eOption=document.createElement("option");   
              eOption.value=country.getAttribute("name");
              eOption.text=country.getAttribute("name");
              dropElement1.add(eOption);
        }
        if(TopnodeList[0].childNodes.length>0)
        {
            //�����б�
            for(var i=0;i<TopnodeList[0].childNodes.length;i++)
            {
               var   id=dropElement1.options[0].value;
               //Ĭ��Ϊ��һ��ʡ�ݵĳ���
               province=TopnodeList[0]; 
               var   eOption=document.createElement("option");  
               eOption.value=province.childNodes[i].getAttribute("name");   
               eOption.text=province.childNodes[i].getAttribute("name");   
               dropElement2.add(eOption);
            }
            if(TopnodeList[0].childNodes[0].childNodes.length>0)
            {
               //���б�
               for(var i=0;i<TopnodeList[0].childNodes[0].childNodes.length;i++)
               {
                  var   id=dropElement2.options[0].value;
                  //Ĭ��Ϊ��һ�����еĵ�һ�����б�
                  city=TopnodeList[0].childNodes[0];  
                  var   eOption=document.createElement("option");  
                  eOption.value=city.childNodes[i].getAttribute("name");   
                  eOption.text=city.childNodes[i].getAttribute("name");   
                  this.document.getElementById("Select3").add(eOption);
               }
            }
        }
    }
  }   
  function   selectCity()   
  {       var   dropElement1=document.getElementById("Select1"); 
          var   name=dropElement1.options[dropElement1.selectedIndex].value;
          //alert(id);
          var   countryNodes=xmlDoc.selectSingleNode('//address/province [@name="'+name+'"]');   
          //alert(countryNodes.childNodes.length); 
          var   province=document.getElementById("Select2");       
          var   city=document.getElementById("Select3");       
          RemoveDropDownList(province);   
          RemoveDropDownList(city);
          if(countryNodes.childNodes.length>0)
          {
               //������          
               for(var   i=0;   i<countryNodes.childNodes.length;   i++)   
               {   
                  var   provinceNode=countryNodes.childNodes[i];     
                  var   eOption=document.createElement("option");   
                  eOption.value=provinceNode.getAttribute("name");   
                  eOption.text=provinceNode.getAttribute("name");   
                  province.add(eOption);   
               }
               if(countryNodes.childNodes[0].childNodes.length>0)
               {
                  //���ѡ��ʡ�ݵĵ�һ�����е����б�
                  for(var i=0;i<countryNodes.childNodes[0].childNodes.length;i++)
                  {
                      //alert("i="+i+"\r\n"+"length="+countryNodes.childNodes[0].childNodes.length+"\r\n");
                      var   dropElement2=document.getElementById("Select2"); 
                      var   dropElement3=document.getElementById("Select3"); 
                      //ȡ����ʡ���µ�һ�������б�
                      var cityNode=countryNodes.childNodes[0];
                      //alert(cityNode.childNodes.length); 
                      var   eOption=document.createElement("option");  
                      eOption.value=cityNode.childNodes[i].getAttribute("name");   
                      eOption.text=cityNode.childNodes[i].getAttribute("name");   
                      dropElement3.add(eOption);
                  }
               }
          }
  }   
  function   selectCountry()   
  {   
          var   dropElement2=document.getElementById("Select2");   
          var   name=dropElement2.options[dropElement2.selectedIndex].value;   
          var   provinceNode=xmlDoc.selectSingleNode('//address/province/city[@name="'+name+'"]');   
          var   city=document.getElementById("Select3");       
          RemoveDropDownList(city);   
          for(var   i=0;   i<provinceNode.childNodes.length;   i++)   
          {   
                  var   cityNode=provinceNode.childNodes[i];     
                  var   eOption=document.createElement("option");   
                  eOption.value=cityNode.getAttribute("name");   
                  eOption.text=cityNode.getAttribute("name");   
                  city.add(eOption);   
          }   
  }   
  function   RemoveDropDownList(obj)   
  {   
      if(obj)
      {
          var   len=obj.options.length;   
          if(len>0)
          {
            //alert(len);   
            for(var   i=len;i>=0;i--)   
            {   
                  obj.remove(i);   
            }
          }
       }
            
  }   
  