package RemoveLists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import aed.positionlist.*;

public class Tester {

  public static <T> String printList(PositionList<T> l) {
      if (l==null) return "null";
      try { return l.toString(); }
      catch (Throwable t) { return "<<<invalid positionList>>>"; }
  }

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }


		
    boolean ok_sofar = true;

    RemoveLists<Integer> obj = new RemoveLists<Integer>();

    // list=null subList=null after=null
    if (ok_sofar) {
      Integer str_arr[] = null;
      PositionList<Integer> str = null;
      Integer pat_arr[] = null;
      PositionList<Integer> pat = null;
      Integer str_arg_arr[] = null;
      PositionList<Integer> str_arg = null;
      Integer pat_arg_arr[] = null;
      PositionList<Integer> pat_arg = null;
      Integer str_sol_arr[] = null;
      PositionList<Integer> str_sol = null;
      Integer pat_sol_arr[] = null;
      PositionList<Integer> pat_sol = null;

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=null subList=[1] after=null
    if (ok_sofar) {
      Integer str_arr[] = null;
      PositionList<Integer> str = null;
      Integer pat_arr[] = {new Integer(1)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = null;
      PositionList<Integer> str_arg = null;
      Integer pat_arg_arr[] = {new Integer(1)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = null;
      PositionList<Integer> str_sol = null;
      Integer pat_sol_arr[] = {new Integer(1)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[1] subList=null after=[1]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(1)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = null;
      PositionList<Integer> pat = null;
      Integer str_arg_arr[] = {new Integer(1)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = null;
      PositionList<Integer> pat_arg = null;
      Integer str_sol_arr[] = {new Integer(1)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = null;
      PositionList<Integer> pat_sol = null;

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[] subList=[] after=[]
    if (ok_sofar) {
      Integer str_arr[] = {};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[] subList=[0] after=[]
    if (ok_sofar) {
      Integer str_arr[] = {};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(0)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(0)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(0)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[] subList=[2] after=[]
    if (ok_sofar) {
      Integer str_arr[] = {};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(2)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(2)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(2)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[0] subList=[] after=[0]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(0)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(0)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(0)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[1] subList=[] after=[1]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(1)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(1)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(1)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[10] subList=[] after=[10]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(10)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(10)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(10)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[0] subList=[0] after=[]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(0)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(0)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(0)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(0)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(0)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[0] subList=[1] after=[0]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(0)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(1)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(0)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(1)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(0)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(1)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[4] subList=[4] after=[]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(4)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(4)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(4)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(4)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(4)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[9] subList=[9] after=[]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(9)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(9)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(9)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(9)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(9)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[1] subList=[1, 1] after=[1]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(1)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(1),new Integer(1)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(1)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(1),new Integer(1)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(1)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(1),new Integer(1)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[1] subList=[2, 3] after=[1]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(1)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(2),new Integer(3)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(1)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(2),new Integer(3)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(1)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(2),new Integer(3)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[3, 2] subList=[3, 2] after=[]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(3),new Integer(2)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(3),new Integer(2)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(3),new Integer(2)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(3),new Integer(2)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(3),new Integer(2)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[13, 10, 4, 14] subList=[] after=[13, 10, 4, 14]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(13),new Integer(10),new Integer(4),new Integer(14)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(13),new Integer(10),new Integer(4),new Integer(14)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(13),new Integer(10),new Integer(4),new Integer(14)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[8, 7, 9, 5] subList=[7] after=[8, 9, 5]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(8),new Integer(7),new Integer(9),new Integer(5)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(7)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(8),new Integer(7),new Integer(9),new Integer(5)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(7)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(8),new Integer(9),new Integer(5)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(7)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[0, 6, 0, 6] subList=[0, 6] after=[]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(0),new Integer(6),new Integer(0),new Integer(6)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(0),new Integer(6)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(0),new Integer(6),new Integer(0),new Integer(6)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(0),new Integer(6)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(0),new Integer(6)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[5, 6, 8, 5, 1, 7] subList=[5] after=[6, 8, 1, 7]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(5),new Integer(6),new Integer(8),new Integer(5),new Integer(1),new Integer(7)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(5)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(5),new Integer(6),new Integer(8),new Integer(5),new Integer(1),new Integer(7)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(5)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(6),new Integer(8),new Integer(1),new Integer(7)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(5)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[7, 7, 7, 5, 7, 5] subList=[7] after=[5, 5]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(7),new Integer(7),new Integer(7),new Integer(5),new Integer(7),new Integer(5)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(7)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(7),new Integer(7),new Integer(7),new Integer(5),new Integer(7),new Integer(5)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(7)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(5),new Integer(5)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(7)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[13, 15, 7, 7, 17, 13] subList=[12] after=[13, 15, 7, 7, 17, 13]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(13),new Integer(15),new Integer(7),new Integer(7),new Integer(17),new Integer(13)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(12)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(13),new Integer(15),new Integer(7),new Integer(7),new Integer(17),new Integer(13)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(12)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(13),new Integer(15),new Integer(7),new Integer(7),new Integer(17),new Integer(13)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(12)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[0, 1, 0, 1, 2, 2] subList=[0, 1, 2] after=[0, 1, 2]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(0),new Integer(1),new Integer(0),new Integer(1),new Integer(2),new Integer(2)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(0),new Integer(1),new Integer(2)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(0),new Integer(1),new Integer(0),new Integer(1),new Integer(2),new Integer(2)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(0),new Integer(1),new Integer(2)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(0),new Integer(1),new Integer(2)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(0),new Integer(1),new Integer(2)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[11, 11, 11, 3, 4, 3, 11, 11] subList=[11] after=[3, 4, 3]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(11),new Integer(11),new Integer(11),new Integer(3),new Integer(4),new Integer(3),new Integer(11),new Integer(11)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(11)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(11),new Integer(11),new Integer(11),new Integer(3),new Integer(4),new Integer(3),new Integer(11),new Integer(11)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(11)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(3),new Integer(4),new Integer(3)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(11)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[13, 14, 14, 8, 14, 8, 14, 8, 14, 8] subList=[14, 8] after=[13, 14]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(13),new Integer(14),new Integer(14),new Integer(8),new Integer(14),new Integer(8),new Integer(14),new Integer(8),new Integer(14),new Integer(8)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(14),new Integer(8)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(13),new Integer(14),new Integer(14),new Integer(8),new Integer(14),new Integer(8),new Integer(14),new Integer(8),new Integer(14),new Integer(8)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(14),new Integer(8)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(13),new Integer(14)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(14),new Integer(8)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[9, 12, 12, 12, 2, 14, 2, 14, 2, 14, 11] subList=[12, 2, 14] after=[9, 12, 12, 2, 14, 2, 14, 11]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(9),new Integer(12),new Integer(12),new Integer(12),new Integer(2),new Integer(14),new Integer(2),new Integer(14),new Integer(2),new Integer(14),new Integer(11)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(12),new Integer(2),new Integer(14)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(9),new Integer(12),new Integer(12),new Integer(12),new Integer(2),new Integer(14),new Integer(2),new Integer(14),new Integer(2),new Integer(14),new Integer(11)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(12),new Integer(2),new Integer(14)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(9),new Integer(12),new Integer(12),new Integer(2),new Integer(14),new Integer(2),new Integer(14),new Integer(11)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(12),new Integer(2),new Integer(14)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[14, 10, 14, 2, 11, 5, 15, 10, 14, 2, 11, 5, 15, 1, 10, 14, 2, 11, 10, 14, 2, 11, 5, 15, 5, 15, 6, 15, 13] subList=[10, 14, 2, 11, 5, 15] after=[14, 1, 10, 14, 2, 11, 5, 15, 6, 15, 13]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(14),new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(5),new Integer(15),new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(5),new Integer(15),new Integer(1),new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(5),new Integer(15),new Integer(5),new Integer(15),new Integer(6),new Integer(15),new Integer(13)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(5),new Integer(15)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(14),new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(5),new Integer(15),new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(5),new Integer(15),new Integer(1),new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(5),new Integer(15),new Integer(5),new Integer(15),new Integer(6),new Integer(15),new Integer(13)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(5),new Integer(15)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(14),new Integer(1),new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(5),new Integer(15),new Integer(6),new Integer(15),new Integer(13)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(10),new Integer(14),new Integer(2),new Integer(11),new Integer(5),new Integer(15)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    // list=[5, 5, 8, 9, 3, 11, 2, 8, 9, 5, 8, 9, 3, 11, 2, 3, 11, 2, 14, 5, 8, 9, 3, 11, 2, 12, 5, 8, 9, 3, 11, 2] subList=[5, 8, 9, 3, 11, 2] after=[5, 8, 9, 3, 11, 2, 14, 12]
    if (ok_sofar) {
      Integer str_arr[] = {new Integer(5),new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2),new Integer(8),new Integer(9),new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2),new Integer(3),new Integer(11),new Integer(2),new Integer(14),new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2),new Integer(12),new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2)};
      PositionList<Integer> str = new NodePositionList<Integer>(str_arr);
      Integer pat_arr[] = {new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2)};
      PositionList<Integer> pat = new NodePositionList<Integer>(pat_arr);
      Integer str_arg_arr[] = {new Integer(5),new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2),new Integer(8),new Integer(9),new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2),new Integer(3),new Integer(11),new Integer(2),new Integer(14),new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2),new Integer(12),new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2)};
      PositionList<Integer> str_arg = new NodePositionList<Integer>(str_arg_arr);
      Integer pat_arg_arr[] = {new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2)};
      PositionList<Integer> pat_arg = new NodePositionList<Integer>(pat_arg_arr);
      Integer str_sol_arr[] = {new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2),new Integer(14),new Integer(12)};
      PositionList<Integer> str_sol = new NodePositionList<Integer>(str_sol_arr);
      Integer pat_sol_arr[] = {new Integer(5),new Integer(8),new Integer(9),new Integer(3),new Integer(11),new Integer(2)};
      PositionList<Integer> pat_sol = new NodePositionList<Integer>(pat_sol_arr);

      try {
        obj.removeAllSubList(str,pat);

        if (!(str_sol == str) && !str_sol.equals(str)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("list should be "+printList(str_sol)+" but is "+printList(str));
          ok_sofar=false;
        }
        else if (!(pat_arg == pat) && !pat_arg.equals(pat)) {
          System.out.print("*** Error: after ");
          System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
          System.out.println("subList should be "+printList(pat_arg)+" but is "+printList(pat));
          ok_sofar=false;
        }
      } catch (Throwable exc) {
        System.out.print("*** Error: ");
        System.out.println("the call removeAllSubList(list="+printList(str_arg)+", subList="+printList(pat_arg)+")");
        System.out.println("raised an exception "+exc+" although it should not have");
        exc.printStackTrace();
        ok_sofar=false;
      }
    }

    if (ok_sofar)
      System.out.println("\n Tester: Test finalizado correctamente.");
  }	
}
