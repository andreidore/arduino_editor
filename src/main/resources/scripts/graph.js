window.graph = new mxGraph($0);
window.graph.setConnectable(true);
window.graph.setAllowDanglingEdges(false);

var style = graph.getStylesheet().getDefaultVertexStyle();
style[mxConstants.STYLE_EDGE] = mxEdgeStyle.ElbowConnector;  
style[mxConstants.STYLE_ELBOW] = mxConstants.ELBOW_VERTICAL;  
style[mxConstants.STYLE_ROUNDED] = true;

new mxRubberband(window.graph);

graph.getSelectionModel().addListener(mxEvent.CHANGE, function(sender, evt)
{
  //alert(JSON.stringify(evt))
  var cells = evt.getProperty('removed');
  
  if (cells==null){
     return;
  }
  

  for (var i = 0; i < cells.length; i++)
  {
    cell=cells[i]
    $0.$server.selectNode(cell.compId);
    console.log(cells[i]);
  }
});

window.parent = window.graph.getDefaultParent();

/*
window.graph.getModel().beginUpdate();
try{
	var v1 = graph.insertVertex(window.parent, null, 'Hello,', 20, 20, 80, 30);
	v1.type='relay';
}finally{
window.graph.getModel().endUpdate();
};
*/